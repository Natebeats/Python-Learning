/**
 * 
 */
package day2402.EventBus;

import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.BaseMatcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import day1802.menu.LoginScreenView;
import day2402.EventBus.messages.BaseMessage;
import day2402.EventBus.messages.SuccessfulLogin;
import day2402.EventBus.messages.TextMessage;

/**
 * @author fred
 *
 */
class EventBusTest {

	InterfaceEventBus iEventBus;

	@BeforeEach
	void initEventBus() {
		iEventBus = EventBus.getInstance();
	}

	@Test
	void test() {

		assertNotNull(iEventBus);
	}

	@Test
	void testSendeMessageHelloWorld() {
		iEventBus.sendMessage(new TextMessage("Hello World"));
	}

	@Test
	void testRegisterListener() {
		iEventBus.registerListener(new ControllerMVC());
	}

	String erhalteneMessage = "";
	String erhalteneMessage2 = "";

	@Test
	void testRegisterListenerUndSendeMessageAnCallback() {

		iEventBus.registerListener(new InterfaceCallback() {

			@Override
			public void handleMessage(BaseMessage baseMessage) {
				erhalteneMessage = (String) ((BaseMessage) baseMessage).getMessageContent();

			}
		});
		assertEquals("", erhalteneMessage);
		iEventBus.sendMessage(new TextMessage("Hello World über den EventBus"));
		assertEquals("Hello World über den EventBus", erhalteneMessage);

	}

	@Test
	void testRegisterListenerUndSendeMultipleMessageAnCallback() {

		iEventBus.registerListener(new InterfaceCallback() {

			@Override
			public void handleMessage(BaseMessage baseMessage) {
				erhalteneMessage = (String) ((BaseMessage) baseMessage).getMessageContent();

			}
		});
		assertEquals("", erhalteneMessage);
		iEventBus.sendMessage(new TextMessage("Hello World über den EventBus"));
		assertEquals("Hello World über den EventBus", erhalteneMessage);

		iEventBus.sendMessage(new TextMessage("Hello World über den EventBus2"));
		assertEquals("Hello World über den EventBus2", erhalteneMessage);

	}

	@Test
	void testRegisterMultipleListenerUndSendeMessageAnCallback() {

		iEventBus.registerListener(new InterfaceCallback() {

			@Override
			public void handleMessage(BaseMessage baseMessage) {
				erhalteneMessage = (String) ((BaseMessage) baseMessage).getMessageContent();

			}
		});
		iEventBus.registerListener(new InterfaceCallback() {

			@Override
			public void handleMessage(BaseMessage baseMessage) {
				erhalteneMessage2 = (String) ((BaseMessage) baseMessage).getMessageContent();

			}
		});

		assertEquals("", erhalteneMessage);

		iEventBus.sendMessage(new TextMessage("Hello World über den EventBus"));
		assertEquals("Hello World über den EventBus", erhalteneMessage);
		assertEquals("Hello World über den EventBus", erhalteneMessage2);

	}

	@Test
	void testRegisterMultipleListenerUndSendeMultipleMessageAnCallback() {

		iEventBus.registerListener(new InterfaceCallback() {

			@Override
			public void handleMessage(BaseMessage baseMessage) {
				erhalteneMessage = (String) ((BaseMessage) baseMessage).getMessageContent();

			}
		});
		iEventBus.registerListener(new InterfaceCallback() {

			@Override
			public void handleMessage(BaseMessage baseMessage) {
				erhalteneMessage2 = (String) ((BaseMessage) baseMessage).getMessageContent();

			}
		});

		assertEquals("", erhalteneMessage);

		iEventBus.sendMessage(new TextMessage("Hello World über den EventBus"));
		assertEquals("Hello World über den EventBus", erhalteneMessage);
		assertEquals("Hello World über den EventBus", erhalteneMessage2);

		iEventBus.sendMessage(new TextMessage("Message 2 über den EventBus"));
		assertEquals("Message 2 über den EventBus", erhalteneMessage);
		assertEquals("Message 2 über den EventBus", erhalteneMessage2);

	}

	@Test
	void testDifferentMessageTypesAndCheckMessageType() {

		iEventBus.registerListener(new InterfaceCallback() {

			@Override
			public void handleMessage(BaseMessage baseMessage) {
				erhalteneMessage = baseMessage.getMessageType();

			}
		});
		iEventBus.sendMessage(new TextMessage("Hello World über den EventBus"));
		assertEquals("textMessage", erhalteneMessage);
		iEventBus.sendMessage(new SuccessfulLogin("fred@me.com"));
		assertEquals("SuccessfulLogin", erhalteneMessage);

	}

	@Test
	void testDifferentMessageTypesAndCheckMessageContent() {

		iEventBus.registerListener(new InterfaceCallback() {

			@Override
			public void handleMessage(BaseMessage baseMessage) {
				erhalteneMessage = baseMessage.toString();

			}
		});
		iEventBus.sendMessage(new TextMessage("Hello World über den EventBus"));
		assertEquals("TextMessage [text=Hello World über den EventBus, messageType=textMessage]", erhalteneMessage);
		iEventBus.sendMessage(new SuccessfulLogin("fred@me.com"));
		assertEquals("SuccessfulLogin [email=fred@me.com, messageType=SuccessfulLogin]", erhalteneMessage);
		iEventBus.sendMessage(new SuccessfulLogin("fred2@me.com"));
		assertEquals("SuccessfulLogin [email=fred2@me.com, messageType=SuccessfulLogin]", erhalteneMessage);

	}

	@Test
	void testDifferentMessageTypesAndCheckMessageContent2() {

		iEventBus.registerListener(new InterfaceCallback() {

			@Override
			public void handleMessage(BaseMessage baseMessage) {
				switch (baseMessage.getMessageType()) {
				case "textMessage":
					erhalteneMessage = (String) ((TextMessage) baseMessage).getMessageContent();
					break;
				case "SuccessfulLogin":
					erhalteneMessage = (String) ((SuccessfulLogin) baseMessage).getMessageContent();

					break;
				default:
					throw new RuntimeException("Message not defined");
				}

			}
		});
		iEventBus.sendMessage(new TextMessage("Hello World über den EventBus"));
		assertEquals("Hello World über den EventBus", erhalteneMessage);
		iEventBus.sendMessage(new SuccessfulLogin("fred@me.com"));
		assertEquals("fred@me.com", erhalteneMessage);

	}

	@Test
	void testDifferentMessageTypesAndFAlseMessageType() {

		iEventBus.registerListener(new InterfaceCallback() {

			@Override
			public void handleMessage(BaseMessage baseMessage) {
				switch (baseMessage.getMessageType()) {
				case "textMessage":
					erhalteneMessage = (String) ((TextMessage) baseMessage).getMessageContent();
					break;
				default:
					throw new RuntimeException("Message not defined");
				}

			}
		});
		iEventBus.sendMessage(new TextMessage("Hello World über den EventBus"));
		assertEquals("Hello World über den EventBus", erhalteneMessage);
		try {
			iEventBus.sendMessage(new SuccessfulLogin("fred@me.com"));
			fail("Message Type wurde falsch erkannt");
		} catch (Exception e) {
			assertEquals("Message not defined", e.getMessage());
		}

	}

}
