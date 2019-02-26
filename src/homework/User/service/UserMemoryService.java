package homework.User.service;

import homework.Passport.Passport;
import homework.User.User;
import homework.User.UserMemoryRepo.UserMemoryRepo;

public class UserMemoryService {

        private UserMemoryRepo userRepo = new UserMemoryRepo();

        public void addUser(User user) {
            userRepo.addUser(user);
        }

        public User findUserById(long id) {
            return userRepo.findUserByID(id);
        }

        public void deleteUser(User user) {
            userRepo.deleteUser(user);
        }

        public void deleteUser(Long id) {
            userRepo.deleteUser(id);
        }

        public void printUsers() {
            userRepo.printUsers();
        }

        public void findUserByPassport(Passport passport) { userRepo.findUserByPassport(passport); }

    }

