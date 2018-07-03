package fish.payara.examples;

import javax.persistence.*;

@Entity
@Table(name = "person_id_overwritten")
@NamedQueries({
    @NamedQuery(name = "ConcreteIdOverwrittenPerson.findOne", query = "select p from ConcreteIdOverwrittenPerson p where p.id = :id"),
    @NamedQuery(name = "ConcreteIdOverwrittenPerson.getAll", query = "select p from ConcreteIdOverwrittenPerson p")
}
)
public class ConcreteIdOverwrittenPerson extends Person {
  @Id
  @GeneratedValue(generator = "seq")
  @SequenceGenerator(name = "seq", sequenceName = "SEQ", allocationSize = 1)
  private long id;
}
