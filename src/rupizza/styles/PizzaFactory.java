package rupizza.styles;

import rupizza.enums.Size;
import rupizza.pizzas.Pizza;

public interface PizzaFactory {
    Pizza createDeluxe(Size size);
    Pizza createMeatzza(Size size);
    Pizza createBBQChicken(Size size);
    Pizza createBuildYourOwn(Size size);
}