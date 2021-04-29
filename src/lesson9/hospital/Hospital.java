package lesson9.hospital;

public class Hospital {

    public static void main(String[] args) {
        HospitalService service = new HospitalService();

        service.addingToHospitalRepository(1,"Joe", UserType.PATIENT);
        service.addingToHospitalRepository(2,"Joe2", UserType.PATIENT);
        service.addingToHospitalRepository(3,"Joe3", UserType.PATIENT);
        service.addingToHospitalRepository(4,"Joe4", UserType.PATIENT);
        service.addingToHospitalRepository(5,"Joe5", UserType.PATIENT);
        service.addingToHospitalRepository(6,"Joe6", UserType.PATIENT);
        service.addingToHospitalRepository(7,"PSYCHOLOGIST", UserType.PSYCHOLOGIST);
        service.addingToHospitalRepository(8,"SURGEON", UserType.SURGEON);
        service.addingToHospitalRepository(9,"TRAUMATOLOGIST", UserType.TRAUMATOLOGIST);
        service.addingToHospitalRepository(10,"THERAPIST", UserType.THERAPIST);



        System.out.println(service.printRepository());
    }
}
