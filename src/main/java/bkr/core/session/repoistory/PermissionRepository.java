package bkr.core.session.repoistory;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import bkr.core.session.model.Permission;

/**
 * 权限表库
 * 
 * @author chengd
 */
@Repository
public interface PermissionRepository extends
        PagingAndSortingRepository<Permission, Long>,
        QueryDslPredicateExecutor<Permission> {

}
