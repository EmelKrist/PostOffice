package postoffice;

/**
 * Интерфейс состояний
 */
public interface State {
    //запуск процесса 
    void Start();
    //переключение в другое состояние 
    State NextState();
}
