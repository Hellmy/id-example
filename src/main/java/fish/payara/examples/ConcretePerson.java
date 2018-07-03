package fish.payara.examples;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "person")
@NamedQueries({
    @NamedQuery(name = "ConcretePerson.findOne", query = "select p from ConcretePerson p where p.id = :id"),
    @NamedQuery(name = "ConcretePerson.getAll", query = "select p from ConcretePerson p")
}
)
public class ConcretePerson extends Person {
}
