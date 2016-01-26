/**
 * Created by wscown on 1/20/16.
 */

enum Colors{
    RED, GREEN, BLUE, YELLOW, PURPLE
}

class BoringThing{};

class ColorfulThing{
    Colors color;

    ColorfulThing(Colors color){
        this.color = color;
    }

    public Colors getColor() {

        return color;
    }
}

class InitializationLab1 {

    public static void main(String [] args){

        BoringThing b1 = new BoringThing();
        BoringThing b2 = new BoringThing();
        BoringThing b3 = new BoringThing();
        BoringThing b4 = new BoringThing();
        BoringThing b5 = new BoringThing();

        ColorfulThing c1 = new ColorfulThing(Colors.RED);
        ColorfulThing c2 = new ColorfulThing(Colors.GREEN);
        ColorfulThing c3 = new ColorfulThing(Colors.BLUE);
        ColorfulThing c4 = new ColorfulThing(Colors.YELLOW);
        ColorfulThing c5 = new ColorfulThing(Colors.PURPLE);

        System.out.println(c1.getColor());
        System.out.println(c2.getColor());
        System.out.println(c3.getColor());
        System.out.println(c4.getColor());
        System.out.println(c5.getColor());
    }

}

