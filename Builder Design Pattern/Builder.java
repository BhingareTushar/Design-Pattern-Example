public interface Builder {



    Builder brand(String brand);

    Builder model(String model);

    Builder color(String color);


}
class Bike {



    private final String brand;
    private final String model;
    private final String color;


    Bike(String brand, String model, String color) {

        this.brand = brand;
        this.model = model;
        this.color = color;

    }

    @Override
    public String toString() {
        return """
                Bike {
           
                
                    brand=%s,
                    model=%s,
                    color=%s,
                 
                 
                }""".formatted( brand, model, color);
    }

}
 class BikeBuilder implements Builder {



    private String brand;
    private String model;
    private String color;



    @Override
    public BikeBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public BikeBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public BikeBuilder color(String color) {
        this.color = color;
        return this;
    }



}

 class BikeSchema {


    private final String brand;
    private final String model;
    private final String color;



    BikeSchema(String brand, String model, String color) {

        this.brand = brand;
        this.model = model;
        this.color = color;

    }

    @Override
    public String toString() {
        return """
                BikeSchema {
                 
           
                    brand=%s,
                    model=%s,
                    color=%s,
                
                }""".formatted( brand, model, color);
    }

}
 class BikeSchemaBuilder implements Builder {



    private String brand;
    private String model;
    private String color;




    @Override
    public BikeSchemaBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public BikeSchemaBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public BikeSchemaBuilder color(String color) {
        this.color = color;
        return this;
    }




    public BikeSchema build() {
        return new BikeSchema(brand, model, color);
    }

}
 class Director {

    public void buildHonda(Builder builder) {
        builder.brand("Honda")
                .color("Blue");

    }

    public void buildHero(Builder builder) {
        builder.brand("Heror")
                .model("Passion")
                .color("Yellow")
                ;
    }

}

 class MainApp {
    public static void main(String[] args) {
        Director director = new Director();

        BikeBuilder builder = new BikeBuilder();
        director.buildHonda(builder);
        builder.model("Shine");


        BikeSchemaBuilder schemaBuilder = new BikeSchemaBuilder();
        director.buildHero(schemaBuilder);

        System.out.println(schemaBuilder.build());

    }

}
