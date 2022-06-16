package kr.or.opengraph.service;

import kr.or.opengraph.lib.OpenGraph;

import java.util.List;

public interface OpenGraphService {

    // 질의 메서드
    public List<OpenGraph> findOpenGraph(String openGraphKey);

    // 초기화 메서드
    public void invalidateOpenGraph();
}
