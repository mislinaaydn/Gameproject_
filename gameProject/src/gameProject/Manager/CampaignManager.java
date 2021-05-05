package gameProject.Manager;

import gameProject.Entity.Campaign;
import gameProject.GameService.CampaignService;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Eklendi");
		
	}

	@Override
	public void deleted(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Silindi");
		
	}

	@Override
	public void updated(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Güncellendi");
		
	}

}
