package homework.User;

import homework.Passport.Passport;

public class VipUser extends User{

    public VipUser(Long id, String name, String lastName, Passport passport) {
        super(id, name, lastName, passport);
    }
}
