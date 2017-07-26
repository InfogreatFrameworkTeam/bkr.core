package bkr.core.session.repoistory;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import bkr.core.session.model.Role;

/**
 * 角色表库
 * 
 * @author chengd
 */
@Repository
public interface RoleRepository extends PagingAndSortingRepository<Role, Long>,
        QueryDslPredicateExecutor<Role> {

}
