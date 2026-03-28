public class Main {
    public static void main(String[] args) {
        Director director1 = Director.getInstance();
        Director director2 = Director.getInstance();

        System.out.println("director1 == director2 -> " + (director1 == director2));
        System.out.println();

        Car citySedan = director1.buildCitySedan();
        Car familySUV = director1.buildFamilySUV();
        Car electricHatchback = director2.buildElectricHatchback();

        System.out.println(citySedan);
        System.out.println(familySUV);
        System.out.println(electricHatchback);
    }
}
