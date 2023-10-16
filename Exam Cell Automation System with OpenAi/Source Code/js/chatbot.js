const form = document.getElementById("chat-form");
const input = document.getElementById("chat-input");
const messages = document.getElementById("chat-messages");
const apiKey = "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";

// collapsible
var coll = document.getElementsByClassName("collapsible");

for (let i = 0; i < coll.length; i++) {
	coll[i].addEventListener("click", function () {
		this.classList.toggle("active");

		var content = this.nextElementSibling;

		if (content.style.maxHeight) {
			content.style.maxHeight = null;
		} else {
			content.style.maxHeight = content.scrollHeight + "px";
		}
	});
}

// chatbot

form.addEventListener("submit", async (e) => {
	e.preventDefault();
	const message = input.value;
	input.value = "";

	messages.innerHTML += `<div class="message user-message">
	  <img src="./icons/user.png" alt="user icon"> <span>${message}</span>
	  </div>`;

	fetch("https://api.openai.com/v1/completions", {
		method: "POST",
		headers: {
			"Content-Type": "application/json",
			Authorization: `Bearer ${apiKey}`,
		},
		body: JSON.stringify({
			prompt: message,
			model: "text-davinci-003",
			temperature: 0,
			max_tokens: 1000,
			top_p: 1,
			frequency_penalty: 0.0,
			presence_penalty: 0.0,
		}),
	})
		.then((response) => response.json())
		.then((data) => {
			const chatbotResponse = data.choices[0].text;

			// console.log(chatbotResponse);

			messages.innerHTML += `<div class="message bot-message">
	  <img src="./icons/chatbot.png" alt="bot icon"> <span>${chatbotResponse}</span>
	  </div>`;
		})
		.catch((error) => {
			// Handle any errors
			console.error(error);
			alert(error?.message || "Something went wrong");
		});
});
