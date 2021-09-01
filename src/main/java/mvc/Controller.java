package mvc;

import java.util.Scanner;

import static mvc.TextConst.*;

public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        view.printMessage(MIN_BARRIER);
        int min = sc.nextInt();

        view.printMessage(MAX_BARRIER);
        int max = sc.nextInt();

        model.setPrimaryBarrier(min, max);

        model.setSecretValue();
        System.out.println(model.getSecretValue());

        while (model.checkValue(inputIntValueWithScanner(sc)));

        view.printMessage(CONGRATULATION + model.getSecretValue() + SPACE_SING);
        view.printMessage(YOUR_WAY + String.valueOf(model.getYourWay()));
    }

    private int inputIntValueWithScanner(Scanner sc) {
        int res = 0;
        view.printMessage(getInputIntMessage());
        while (true) {
            // check int-value
            while (!sc.hasNextInt()) {
                view.printMessage(WRONG_INPUT_INT_DATA + getInputIntMessage());
                sc.next();
            }
            // check value into diapason
            if ((res = sc.nextInt()) <= model.getMinBarrier() ||
                res >= model.getMaxBarrier()) {
                view.printMessage(WRONG_INPUT_INT_DATA + getInputIntMessage());
                continue;
            }
            break;
        }
        return res;
    }

    private String getInputIntMessage() {
        return view.concatenationString(
                INPUT_INT_DATA, OPENS_SQUARE_BRACKET,
                String.valueOf(model.getMinBarrier()), SPACE_SING,
                String.valueOf(model.getMaxBarrier()),
                CLOSING_SQUARE_BRACKET, SPACE_SING,
                EQUAL_SING, SPACE_SING );
    }
}
