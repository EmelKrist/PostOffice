package postoffice;

/**
 * Класс конкретного состояния почтового отделения - отправка печатных изданий
 * соответствующим подписчикам.
 */
public class Mailing implements State {
    
    @Override
    public void Start() {
        System.out.println("Отправка печатных изданий соответствующим подписчикам...");
    }

    @Override
    public State NextState() {
        //переключаем в состояние получения печатных изданий
        return new Receiving();
    }
}