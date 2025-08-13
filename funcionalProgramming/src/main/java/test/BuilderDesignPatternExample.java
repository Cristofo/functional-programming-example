package test;

import lombok.Getter;
import lombok.ToString;

import java.util.function.Consumer;

public class BuilderDesignPatternExample {

    public static void main(String[] args) {
        MobileBuilder builder = new MobileBuilder();
        Mobile mobile = builder.with(myBuilder ->
        {
            myBuilder.ram = 4;
            myBuilder.battery = 4000;
            myBuilder.processor = "A14 sds";
        }).createMobile();

        System.out.println(mobile.toString());

    }


}

@Getter
@ToString
class Mobile {
    final int ram, storage;
    final int battery;
    final int camera;
    final String processor;
    final double screenSize;

    public Mobile(MobileBuilder builder) {
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.battery = builder.battery;
        this.camera = builder.camera;
        this.processor = builder.processor;
        this.screenSize = builder.screenSize;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "ram=" + ram +
                ", storage=" + storage +
                ", battery=" + battery +
                ", camera=" + camera +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
@ToString
class MobileBuilder {
    int ram, storage;
    int battery;
    int camera;
    String processor;
    double screenSize;

    public MobileBuilder with(Consumer<MobileBuilder> buildFields) {
        buildFields.accept(this);
        return this;
    }

    public Mobile createMobile() {
        return new Mobile(this);
    }
}