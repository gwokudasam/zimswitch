package zw.co.getcash.integrations.zimswitch.repository.search;

import zw.co.getcash.integrations.zimswitch.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {
}
