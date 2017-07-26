package bkr.core.session.repoistory;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import bkr.core.session.model.User;

/**
 * 用户表库
 * 
 * @author chengd
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long>,
        QueryDslPredicateExecutor<User> {

}
