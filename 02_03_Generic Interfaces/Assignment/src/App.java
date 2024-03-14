public class App {
    public static void main(String[] args) throws Exception {
        Property<Double> myDoubleProperty = new Property<Double>(9.0);
        Property<Double> myDoubleProperty2 = new Property<Double>(5.0);
        System.out.println(myDoubleProperty.isGreaterThan(myDoubleProperty2.get()));

        Property<Double> myDoubleProperty3 = new Property<Double>(3.0);
        Property<Double> myDoubleProperty4 = new Property<Double>(5.0);
        System.out.println(myDoubleProperty3.isLessThan(myDoubleProperty4.get()));

        Property<Double> myDoubleProperty5 = new Property<Double>(4.0);
        Property<Double> myDoubleProperty6 = new Property<Double>(4.0);
        System.out.println(myDoubleProperty5.isEqual(myDoubleProperty6.get()));

    }
}