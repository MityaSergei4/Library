import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class Solution {

    public static void main(String[] args){

        // Создание студента

        try(Session session = HibernateUtil.getSession()) {
            session.beginTransaction();

            Student student = new Student();
            student.setEmail("sh@mail.ru");
            student.setPassword("q");

            session.save(student);

            session.getTransaction().commit();
        } catch (Throwable cause){
            cause.printStackTrace();
        }

        // Получение студента

        List<Student> list = null;

        try(Session session = HibernateUtil.getSession()){
            session.beginTransaction();

            Query query = session.createQuery("FROM Student");
            list = (List<Student>) query.list();

            session.getTransaction().commit();
        } catch (Throwable cause){
            cause.printStackTrace();
        }

        if(list != null && !list.isEmpty()){
            for(Student pair : list){
                System.out.println(pair.getEmail());
                if(pair.getEmail().equals("sh@mail.ru")){
                    System.out.println("Есть");
                } else {
                    System.out.println("Нету");
                }
            }
        } else {
            System.out.println("Таблица пуста =(");
        }
    }
}