package solid_principles.liskov_substitution_principle;

public class Facebook extends SocialMedia{

    //It supports all features of Social Media Parent class. So it can replace Social Media parent class.
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

    }
}
