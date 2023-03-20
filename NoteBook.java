public interface NoteBook {

        void sales();
    }

     class SprialNoteBook implements NoteBook {
        @Override
        public void sales() {
            System.out.println("Inside SprialNoteBook::sales() method.");
        }
    }

     class BoundNoteBook implements NoteBook {
        @Override
        public void sales() {
            System.out.println("Inside BoundNoteBook::sales() method.");
        }
    }

     class Classmate implements NoteBook {
        @Override
        public void sales() {
            System.out.println("Inside Classmate::sales() method.");
        }
    }
     class Navneet implements NoteBook {
        @Override
        public void sales() {
            System.out.println("Inside Navneet::sales() method.");
        }
    }
    abstract class abstractFactory {
        abstract NoteBook getNoteBook(String NoteBookType) ;
    }


     class NoteBookFactory extends abstractFactory {
        @Override
        public NoteBook getNoteBook(String NoteBookType){
            if(NoteBookType.equalsIgnoreCase("Classmate")){
                return new Classmate();
            }else if(NoteBookType.equalsIgnoreCase("Navneet")){
                return new Navneet();
            }
            return null;
        }
    }




 class SprialNoteBookFactory extends abstractFactory {
    @Override
    public NoteBook getNoteBook(String NoteBookType){
        if(NoteBookType.equalsIgnoreCase("RECTANGLE")){
            return new SprialNoteBook();
        }else if(NoteBookType.equalsIgnoreCase("SQUARE")){
            return new BoundNoteBook();
        }
        return null;
    }
}
     class FactoryProducer {
        public static abstractFactory getFactory(boolean note){
            if(note){
                return new SprialNoteBookFactory();
            }else{
                return new NoteBookFactory();
            }
        }
    }

   class abstractFactoryPatternDemo {
        public static void main(String[] args) {

            abstractFactory NoteBookFactory = FactoryProducer.getFactory(false);

            NoteBook NoteBook1 = NoteBookFactory.getNoteBook("Classmate");

            NoteBook1.sales();

            NoteBook NoteBook2 = NoteBookFactory.getNoteBook("Navneet");

            NoteBook2.sales();

            abstractFactory NoteBookFactory1 = FactoryProducer.getFactory(true);

            NoteBook NoteBook3 = NoteBookFactory1.getNoteBook("Classmate");

            NoteBook3.sales();

            NoteBook NoteBook4 = NoteBookFactory1.getNoteBook("Navneet");

            NoteBook4.sales();

        }
    }




