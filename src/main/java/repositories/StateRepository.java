package repositories;

import jdk.javadoc.internal.doclets.formats.html.markup.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<Comment, Long> {

}
