public class Runner {
    public static void main(String[] args) {
        BootStrapper bootStrapper = new BootStrapper();

        BootStrapper.getSession().beginTransaction();
        BootStrapper.getSession().createQuery("from Institution where id.studentId = 1").list();
        BootStrapper.getSession().getTransaction().commit();


    }
}
