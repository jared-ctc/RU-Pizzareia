package rupizza.pizzas;

import rupizza.enums.Crust;
import rupizza.enums.Size;
import rupizza.enums.Topping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static rupizza.enums.Topping.*;

public class Deluxe extends Pizza {
    private static final double SIZE_SMALL_PRICE = 16.99;
    private static final double SIZE_MEDIUM_PRICE = 18.99;
    private static final double SIZE_LARGE_PRICE = 20.99;

    private static final List<Topping> toppings = new ArrayList<>(Arrays.asList(Sausage, Pepperoni, GreenPepper, Onion, Mushroom));

    public Deluxe(Crust crust, Size size) {
        super(new ArrayList<>(toppings),
                crust,
                size
        );
    }

    @Override
    public double price() {
        return switch (this.getSize()) {
            case Small -> SIZE_SMALL_PRICE;
            case Medium -> SIZE_MEDIUM_PRICE;
            default -> SIZE_LARGE_PRICE;
        };
    }
}
