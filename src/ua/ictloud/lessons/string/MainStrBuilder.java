package ua.ictloud.lessons.string;

/**
 * Created by student on 20-Apr-18. ЫtringBuilder  быстрее чуток, StringBuffer защита в многопото среде.
 * Изменения вписуются сразу в обьект
 */
public class MainStrBuilder {
    public static void main(String[] args) {
        StringBuilder sb0 = new StringBuilder();    // размер 16, когда 75% заполнено пересоздается в удвоенном
        StringBuilder sb = new StringBuilder("Hello"); // логический размер 5 из 16
        System.out.println(sb.length());
   //     StringBuffer sbud = new StringBuffer("Hello");
        sb.append("");
        System.out.println(sb.length());
        sb.append("   ");                  //добавил символ
        System.out.println(sb.length());
        System.out.println(sb.toString());
        System.out.println(sb.delete(1,3)); //удаляем
        System.out.println(sb.insert(1,"XXX"));     //вставляем
        System.out.println(sb.reverse());      //реверс
        sb.trimToSize();                    //уменьшаем размер массива !!!!!!!!! вручную учитывая 75%

        String rrr = sb.toString();     //обратно преоброзовали в string
    }
}
