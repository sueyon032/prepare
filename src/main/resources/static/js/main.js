const btnOpenPopups = document.querySelectorAll('.btn-open-popup');
    const countryModal = document.getElementById('countryModal');

    btnOpenPopups.forEach((btn) => {
        btn.addEventListener('click', () => {
            const countryId = btn.getAttribute('id').replace('btnCountry', '');
            const modalContent = document.getElementById('modalCountryInfo' + countryId)?.innerHTML;
            if (modalContent) {
                updateModalContent(modalContent);
                countryModal.style.display = 'block';
            }
        });
    });

    function updateModalContent(content) {
        // Assuming you have a modal body element
        const modalBody = document.querySelector('.modal_body');
        modalBody.innerHTML = content;
    }