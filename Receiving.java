package postoffice;

/**
 * Класс конкретного состояния почтового отделения - получение печатных изданий.
 */
public class Receiving implements State {
    
    @Override
    public void Start() {
        System.out.println("Получение журналов и газет от издательства...");
    }

    @Override
    public State NextState() {
        //переключаем в состояние отправки печатных изделий 
        return new Mailing();
    }
}