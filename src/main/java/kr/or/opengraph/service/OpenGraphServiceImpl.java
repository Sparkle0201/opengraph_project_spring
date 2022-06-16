package kr.or.opengraph.service;

import kr.or.opengraph.lib.OpenGraph;
import kr.or.opengraph.vo.OpenGraphVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpenGraphServiceImpl implements OpenGraphService{

    @Autowired
    private OpenGraphVO openGraphVO;
    @Override
    public List<OpenGraph> findOpenGraph(String openGraphKey) {
        return null;
    }

    @Override
    public void invalidateOpenGraph() {

    }
}
