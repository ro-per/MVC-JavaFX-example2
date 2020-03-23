package oberserver;

import java.util.Scanner;

public class MainObserverTest
{
    public MainObserverTest()
    {
        ObservableValue ov = new ObservableValue(0);
        TextObserver to = new TextObserver(ov);
        ov.addObserver(to);
        TextObserver to2 = new TextObserver(ov);
        ov.addObserver(to2);

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        ov.setValue(value);
    }

    public static void main(String [] args)
    {
        MainObserverTest m = new MainObserverTest();
    }
}