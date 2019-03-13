package homework.User.service.impl;

import homework.Passport.domain.Passport;
import homework.User.Repo.UserRepo.UserRepo;
import homework.User.domain.Race;
import homework.User.domain.User;
import homework.User.search.UserSearchCondition;
import homework.User.service.UserService;

import java.util.List;

public class UserDefaultService implements UserService {

    private final UserRepo userRepo;

    public UserDefaultService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void add(User user) {
        if (user != null) {
            userRepo.add(user);
        }
    }

    @Override
    public User findById(Long id) {
        return userRepo.findById(id);
    }

    @Override
    public void delete(User user) {
        if (user != null) {
            this.deleteById(user.getId());
        }
    }

    @Override
    public List<User> search(UserSearchCondition userSearchCondition) {
        return userRepo.search(userSearchCondition);
    }

    @Override
    public void deleteById(Long id) {
        if (id != null) {
            userRepo.deleteById(id);
        }
    }

    @Override
    public void printAll() {
        userRepo.printAll();
    }

    @Override
    public void update(User user) {
        if (user != null) {
            userRepo.update(user);
        }
    }
}

