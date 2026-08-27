package solid_principles.liskov_substitution_principle;

public class Instagram extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void postPhotos() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall() {
        //Not Applicable. So it can't replace entire Social Media parent class.
    }
}
