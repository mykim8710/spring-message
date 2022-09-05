package com.example.message;

import com.example.message.domain.item.Item;
import com.example.message.domain.item.ItemRepository;
import com.example.message.domain.item.ItemType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final ItemRepository itemRepository;

    /**
     * 테스트용 데이터 추가
     */
    @PostConstruct
    public void init() {
        itemRepository.save(new Item("itemA", 10000, 10, true, new ArrayList<String>(Arrays.asList("SEOUL")), ItemType.BOOK, "FAST"));
        itemRepository.save(new Item("itemB", 20000, 20, true, new ArrayList<String>(Arrays.asList("BUSAN")), ItemType.BOOK, "FAST"));
    }

}