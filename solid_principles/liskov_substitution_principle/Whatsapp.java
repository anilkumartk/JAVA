package solid_principles.liskov_substitution_principle;

public class Whatsapp extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void postPhotos() {
    //Not Applicable. So it can't replace entire Social Media parent class.
    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall() {

    }
}
