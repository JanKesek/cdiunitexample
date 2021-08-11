package developercoffe;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Developer {
    @Inject
    Coffe coffe;

    public String letsGo() {
        return coffe.drink() + " driven development";
    }
}
