package com.back.boundedContext.market.out;

import com.back.boundedContext.market.domain.MarketMember;
import com.back.boundedContext.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MarketMemberRepository extends JpaRepository<MarketMember, Integer> {
    Optional<MarketMember> findByUsername(String username);
}
