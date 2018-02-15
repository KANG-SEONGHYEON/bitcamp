package java100.app.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java100.app.dao.ArtistDao;
import java100.app.dao.MemberDao;
import java100.app.domain.Artist;
import java100.app.domain.Member;
import java100.app.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired MemberDao memberDao;
    @Autowired ArtistDao artistDao;
    
    @Override
    public List<Member> list(int pageNo, int pageSize, Map<String, Object> options) {
        
        HashMap<String,Object> params = new HashMap<>();
        params.put("startIndex", (pageNo - 1) * pageSize);
        params.put("size", pageSize);
        
        if (options != null) {
            params.putAll(options);
        }
        
        return memberDao.findAll(params);
    }

    @Override
    public Member get(int no) {
        return memberDao.findByNo(no);
    }
    
    @Override
    public Member get(String email, String password) {
        
        System.out.println(password);
        
        HashMap<String,Object> params = new HashMap<>();
        params.put("email", email);
        params.put("password", password);
        
        return memberDao.findByEmailAndPassword(params);
    }
    
    @Override
    public int getTotalCount() {
        return memberDao.countAll();
    }

    @Override 
    public int add(Member member, Artist artist) {
        
        // 부모 테이블의 no를 외부키로 가져오므로 부모 테이블을 먼저 insert 해야함.
        int count = memberDao.insert(member);
        artistDao.insert(artist);
        
        
        
        return count;
    }
    
    @Override
    public int update(Member member, Artist artist) {
        // 각각 update를 따로 실행하므로 실행 순서는 중요하지 않다.
        memberDao.update(member); 
        return artistDao.update(artist);
        
    }
    
    @Override
    public int delete(int no) {

        artistDao.delete(no);
        return memberDao.delete(no);
    }
    
}
