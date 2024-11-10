package rupizza.styles;

import rupizza.enums.Size;
import rupizza.pizzas.*;

import static rupizza.enums.Crust.*;
import static rupizza.enums.Crust.HandTossed;

public class ChicagoPizza implements PizzaFactory {
    @Override
    public Pizza createDeluxe(Size size) {
        return new Deluxe(DeepDish, size);
    }

    @Override
    public Pizza createMeatzza(Size size) {
        return new Meatzza(Pan, size);
    }

    @Override
    public Pizza createBBQChicken(Size size) {
        return new BBQChicken(Stuffed, size);
    }

    @Override
    public Pizza createBuildYourOwn(Size size) {
        return new BuildYourOwn(Pan, size);
    }
}
