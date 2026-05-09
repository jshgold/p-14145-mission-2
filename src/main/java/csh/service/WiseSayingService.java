package csh.service;

import csh.entity.WiseSaying;
import csh.repository.WiseSayingRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WiseSayingService {
    private final WiseSayingRepository repo = new WiseSayingRepository();
    private int id = 1;

    public Integer create(String content, String author) {
        WiseSaying ws = new WiseSaying.Builder()
                .id(id++)
                .content(content)
                .author(author)
                .build();
        repo.save(ws);
        return ws.getId();
    }

    public List<WiseSaying> getList() {
        return new ArrayList<>(repo.findAll().values());
    }

    public boolean deleteById(int id) {
        return repo.delete(id) != null;
    }

    public WiseSaying findById(int id) {
        Map<Integer,WiseSaying> map = repo.findAll();
        return map.get(id);
    }

    public void update(WiseSaying wiseSaying, String content, String author) {
        wiseSaying.setContent(content);
        wiseSaying.setAuthor(author);
        repo.save(wiseSaying);
    }
}
