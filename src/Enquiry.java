public class Enquiry {

    String fullName;
    String email;
    Integer contactNumber;
    String technology;

    private void show(){
        System.out.println("In show");
    }
    public static void main(String[] args) {
        Enquiry enquiry = new Enquiry();
//        enquiry.fullName.toLowerCase();
        enquiry.show();
    }
}
