package QA_Automation.Src.HomeWork_310326;

    public class Master {
        public static void main(String[] args) {
            String[] users = {
                    "Gordon",
                    "John",
                    "Jane"
            };

            DummyAppProMax app = new DummyAppProMax(users);

            app.toggleCamera();
            app.toggleScreenShare();

            app.endCall();

            System.out.println(app.getLastCallDuration());

        }
    }
class DummyApp {
    protected String[] participants;
    protected boolean isCallActive;
    protected long startTime;
    protected long endTime;

    public DummyApp(String[] participants) {
        this.participants = participants;
        this.isCallActive = true;
        this.startTime = System.currentTimeMillis();
        System.out.println("Call started");
    }

    public void endCall() {
        if (isCallActive) {
            endTime = System.currentTimeMillis();
            isCallActive = false;
            System.out.println("Call ended");
        }
    }

    public long getLastCallDuration() {
        if (endTime == 0) return 0;
        return (endTime - startTime) / 1000;
    }
}
class DummyAppPro extends DummyApp {

    protected boolean isCameraOn;

    public DummyAppPro(String[] participants) {
        super(participants);

        if (participants.length > 10) {
            System.out.println("Too many participants! Max is 10");
            isCallActive = false;
        }

        this.isCameraOn = false;
    }

    public void toggleCamera() {
        if (!isCallActive) {
            System.out.println("Call is not active");
            return;
        }

        isCameraOn = !isCameraOn;
        System.out.println("Camera: " + (isCameraOn ? "ON" : "OFF"));
    }
}
class DummyAppProMax extends DummyAppPro {

    private boolean isSharing;

    public DummyAppProMax(String[] participants) {
        super(participants);
        isSharing = false;
    }

    public void toggleScreenShare() {
        if (!isCallActive) {
            System.out.println("Call is not active");
            return;
        }

        isSharing = !isSharing;
        System.out.println("Sharing: " + (isSharing ? "ON" : "OFF"));
    }
}