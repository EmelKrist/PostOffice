package postoffice;

public class PostOffice {

    public static void main(String[] args) {
        //создаем объект контекста 
        Context PostOffice = new Context();
        //задаем начальное состояние - получение печатных изданий
        PostOffice.setState(new Receiving());
        //запускаем процесс - получение печатных изданий
        PostOffice.Start();
        //переключаем объект в следующее соостояние - отправка печатных изданий
        PostOffice.NextState();
        //запускаем процесс - отправка печатных изданий
        PostOffice.Start();
    }
}
