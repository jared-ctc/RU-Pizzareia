package rupizza.styles;

import rupizza.enums.Crust;
import rupizza.enums.Size;
import rupizza.pizzas.*;

import static rupizza.enums.Crust.*;

public class NYPizza implements PizzaFactory {
    @Override
    public Pizza createDeluxe(Size size) {
        return new Deluxe(Brooklyn, size);
    }

    @Override
    public Pizza createMeatzza(Size size) {
        return new Meatzza(Thin, size);
    }

    @Override
    public Pizza createBBQChicken(Size size) {
        return new BBQChicken(HandTossed, size);
    }

    @Override
    public Pizza createBuildYourOwn(Size size) {
        return new BuildYourOwn(HandTossed, size);
    }
}
