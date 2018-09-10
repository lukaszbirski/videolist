package com.example.videos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    VideoDao videoDao = new VideoDao();

    @GetMapping("/")
    public String video(){
        return "video";
    }

    @GetMapping("/add")
    public String add(@RequestParam String name, @RequestParam String url, ModelMap modelMap){
        Video video = new Video(name, url);
        if (!url.contains("embed")){
            Youtubehelper youtubeHelper = new Youtubehelper();
            video.setUrl("https://www.youtube.com/embed/"+youtubeHelper.extractVideoIdFromUrl(url));
        }

        modelMap.put("video", video);
        videoDao.addVideo(video);
        return "redirect:/show";
    }

    @GetMapping("/show")
    public String showall(ModelMap map){
        map.put("videoDao",videoDao.findAllVideo());
        return "show";
    }
}
