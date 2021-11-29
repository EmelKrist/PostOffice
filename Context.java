package postoffice;

/**
 * Класс контекст, объекты которого меняют свое поведение 
 * в зависимости от состояния.
 */
public class Context {
    
    //поле для хранения нынешнего состояния 
    State PostOfficeState;
    
    //метод для принудительного задания нынешного состояния 
    public void setState (State PostOfficeState) {
        this.PostOfficeState = PostOfficeState;
    }
    
    //метод переключения в следующее состояние 
    public void NextState() {
        PostOfficeState = PostOfficeState.NextState();
    }
    
    //метод запуска процесса нынешнего состояния объекта 
    public void Start() {
        PostOfficeState.Start();
    }
}
