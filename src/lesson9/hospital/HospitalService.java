package lesson9.hospital;

import java.util.Map;
import java.util.TreeMap;

public class HospitalService {
    Map<Integer, User> repository = new TreeMap<>();

    public User registrationNewUserHospital(String name, UserType userType) {
        return new User(name, userType);
    }

    public void addingToHospitalRepository(int id, String name, UserType userType) {
        repository.put(id, registrationNewUserHospital(name, userType));
    }

    public Map<Integer, User> printRepository() {
        return repository;
    }
}
