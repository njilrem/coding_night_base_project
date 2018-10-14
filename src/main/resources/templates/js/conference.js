// window.onload(add_questions_for_vote);
document.addEventListener('DOMContentLoaded', add_questions_for_vote);

function list_click(item) {
    var id = parseInt(item.id.replace('question', ''));
    try {
        document.getElementById("vote-panel" + id).className = "vote-panel-show";
        document.getElementById("vote-panel" + id).id = "vote-panel-show";
    } catch (e) {
        alert('Ви вже проголосували за це питання!')
    }
}

function delete_elem() {

    //post request
    event.preventDefault();
    event.stopImmediatePropagation();
    var elem = document.getElementById("vote-panel-show");
    console.log(event.target.textContent); //Виводить в консоль "За" або "Проти" або "Утримався"
    elem.parentNode.removeChild(elem);
}

function add_questions_for_vote() {
    for (var i = 6; i < 10; i++) {
        var question = document.createElement("li");
        question.id = 'question' + i;
        question.innerHTML = '' +
            '<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odio ducimus consectetur culpa deserunt error, beatae esse id molestiae mollitia commodi dignissimos distinctio unde amet fuga doloribus corrupti tempore velit sint?\n' +
            '          <div id="vote-panel' + i + '" class="vote-panel">\n' +
            '            <div class="vote-button"><button class="option" onclick="delete_elem()">За</button></div>\n' +
            '            <div class="vote-button"><button class="option" onclick="delete_elem()">Утриматися</button></div>\n' +
            '            <div class="vote-button"><button class="option" onclick="delete_elem()">Проти</button></div>\n' +
            '          </div>\n' +
            '        </p>';

        question.addEventListener('click', function () {
                list_click(this);
            }
        );
        document.getElementById("questions").appendChild(question);
    }
    document.getElementById("question-loader").removeEventListener('click', add_questions_for_vote);
    console.log(document.getElementById("question-loader"));
}



