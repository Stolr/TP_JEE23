package ejb;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-01-06T22:34:03")
@StaticMetamodel(Message.class)
public class Message_ { 

    public static volatile SingularAttribute<Message, Long> id;
    public static volatile SingularAttribute<Message, String> contenu;
    public static volatile SingularAttribute<Message, String> pseudo;
    public static volatile SingularAttribute<Message, Long> date;

}