package com.example.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {
    //mockMvc TomcatサーバへデプロイすることなくHttpリクエスト・レスポンスを扱うためのMockオブジェクト
    @Autowired
    private MockMvc mvc;

    // getリクエストでviewを指定し、httpステータスでリクエストの成否を判定
    @Test
    void indexへのGETリクエストに対して200が返る() throws Exception {
        // andDo(print())でリクエスト・レスポンスを表示
        //this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk());
    	this.mvc.perform(get("/")).andExpect(status().isOk()).andExpect(status().isOk());
    }
}
