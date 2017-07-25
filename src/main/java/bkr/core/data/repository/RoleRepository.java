package bkr.core.data.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import bkr.core.data.model.Role;

/**
 * 角色表库
 * 
 * @author chengd
 */
@Repository
public interface RoleRepository extends PagingAndSortingRepository<Role, Long>,
        QueryDslPredicateExecutor<Role> {

}
