package homework.User.UserMemoryRepo;

import homework.ArrayUtils.ArrayUtils;
import homework.Passport.Passport;
import homework.Passport.PassportMemoryRepo.PassportMemoryRepo;
import homework.User.User;
import static homework.Storage.Storage.users;

public class UserMemoryRepo {

    private int userIndex = -1;
    private PassportMemoryRepo passportMemoryRepo = new PassportMemoryRepo();


    public void addUser(User user) {
        if (userIndex == users.length-1) {
            User[] newUsers = new User[ (int) (userIndex * 1.5)];
            System.arraycopy(users, 0, newUsers, 0, users.length);
            users = newUsers;
        }
        userIndex++;
        users[userIndex] = user;

        passportMemoryRepo.addPassport(user.getPassport());
        
    }



    public User findUserByID(Long id) {
        Integer index = findUserByIndex(id);
        if (index != null) {
            return users[index];
        }

        return null;
    }

    public User findUserByPassport(Passport passport) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getPassport().equals(passport)) {
                return users[i];
            }
        }
        return null;
    }

    public void deleteUser(User user) {
        Integer index = findUserByEntity(user);
        deleteUserByIndex(index);
    }

    public void deleteUser(Long id) {
        Integer index = findUserByIndex(id);
        deleteUserByIndex(index);
    }

    public void printUsers() {
        for (User user : users) {
            System.out.println(user);

        }
    }

    public Integer findUserByIndex(Long index) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId().equals(index)) {
                return i;
            }
        }
        return null;

    }

    public Integer findUserByEntity(User User) {
        for (int i = 0; i<users.length; i++) {
            if (users[i].equals(User)) {
                return i;
            }
        }
        return null;
    }

    public void deleteUserByIndex(int index) {
        ArrayUtils.removeElement(users, index);
        userIndex--;
    }
}
