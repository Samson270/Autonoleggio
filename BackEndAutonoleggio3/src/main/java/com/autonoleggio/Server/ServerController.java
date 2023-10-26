package com.autonoleggio.Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path="/server")
public class ServerController {
	
	@Autowired
	private ServerService serverService;
	
	@GetMapping(path="/status")
	public String getServerStatus() {
		String uptime = serverService.getServerStatus();
		return uptime;
	}
}
