
public interface Mobile {
    void manufacture();
}

 class Samsung implements Mobile {

    @Override
    public void manufacture() {
        System.out.println("Samsung manufacture ");
    }
}

 class Vivo implements Mobile {

    @Override
    public void manufacture() {
        System.out.println("VIVI manufacture");
    }
}

 class OPPO implements Mobile {

    @Override
    public void manufacture() {
        System.out.println("OPPO manufacture");
    }
}

class MobileFactory {


    public Mobile getMobile(String mobilType){
        if(mobilType == null){
            return null;
        }
        if(mobilType.equalsIgnoreCase("Samsung")){
            return new Samsung();

        } else if(mobilType.equalsIgnoreCase("VIVO")){
            return new Vivo();

        } else if(mobilType.equalsIgnoreCase("OPPO")){
            return new OPPO();
        }

        return null;
    }
}

 class FactoryPatternDemo {

    public static void main(String[] args) {
        MobileFactory MobileFactory = new MobileFactory();
        Mobile Mobile1 = MobileFactory.getMobile("Samsung");


        Mobile1.manufacture();


        Mobile Mobile2 = MobileFactory.getMobile("VIVO");


        Mobile2.manufacture();


        Mobile Mobile3 = MobileFactory.getMobile("OPPO");


        Mobile3.manufacture();
    }
}
